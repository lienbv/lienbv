1/ FetchType.LAZY và FetchType.Eager có cơ chế hoạt động như thế nào? Khi nào thì nên sử dụng.
FetchType.LAZY chỉ khi nào gọi đến các luồng xử lý mà data ở các bảng liên quan mới thực hiện JOIN bảng (Nếu sử dụng OneToMany và ManyToOne). 
Còn Eager luôn tự động JOIN tất cả. Cần cân nhắc sử dụng tuỳ nhu cầu để giảm tải cho Database

2/ GET có ưu điểm gì hơn POST về mặt performance? Nêu nguyên nhân và chỉ rõ điều này.
Tham khảo nguyên lý idempotant của API. GET có thể bookmark đc, cache được ở cả phía server và Client

3/ Giải thích khi nào nên dùng PATCH và PUT?
PUT là update kiểu ghi đè nếu đối tượng đã tồn tại, nếu không có thì sẽ tạo mới
PATCH lành hơn, update 1 phần đối tượng

4/ Index trong Database có bao nhiêu loại? Khi nào thì nên dùng B-Tree index, khi nào nên dùng Hash Index.
Index hay dùng chủ yếu là loại B-Tree. Có nhiều loại nhưng default là B-Tree. 
Chủ yếu hay dùng B-Tree và Hash Index. B-Tree có tác dụng tốt nhất cho tìm kiểu = hoặc LIKE, tìm trong các khoảng lớn hơn nhỏ hơn.
 Hash Index sẽ tìm nhanh hơn nếu tìm kiếm != 
. Nếu dùng B-Tree mà tìm kiếm != sẽ phải duyệt từng bản ghi trong DB => Không tối ưu

5/ Hikari Pool / Connection Pool trong Spring Boot là gì?
Trung bình DB chỉ hỗ trợ tối đa 1000 connect (google nhé không nhớ chính xác bao nhiêu nhưng k quá nhiều).
 Connection Pool giúp tái sử dụng lại các connect đã khởi tạo trong 1 khoảng thời gian => Giúp tránh quá tải DB

6/ Set trong Java kiểm tra 1 object / 1 key đã tồn tại như thế nào?
Đọc về cơ chế equals and hashCode

7/ Phân biệt bộ nhớ Heap và bộ nhớ Stack.
Câu khá cơ bản nên google. K nên trả lời thiếu ý gì.

8/ So sánh ArrayList và LinkedList? Khi nào nên sử dụng cái nào?
ArrayList sử dụng mảng động để lưu data.
LinkedList sử dụng danh sách liên kết đôi.
ArrayList nên dùng khi chỉ lưu để get data ra và ít thay đổi.
 Do get ra nhanh hơn LinkedList vì không cần duyệt từng node từ đầu như LinkedList.
 LinkedList thì ngược lại, get data ra lâu nhưng sửa xoá, thêm thi nhanh hơn

9/  Kể ra 1 số cách chống case exclusive khi 2 người cùng gọi API 1 thời điểm.
Lock bản ghi tạm thời...

10/ Browser thực chất làm gì khi người dùng tương tác? (Có thể hiểu là gửi request, header như nào, HTTP Protocol,...)
Đọc về HTTP 1.1, 1.0. 1 request thì có header và body. Google thêm

11/  @Autowired Inject 1 Bean như thế nào. Bean là cái gì?
Google thêm để đầy đủ. Chú ý nếu có nhiều Bean thì cần thiết định @Qualifier hoặc @Primary để biết sẽ ưu tiên khởi tạo Bean nào, k sẽ bị lỗi

12/ Partition trong Database là gì?
Cơ chế này lưu data theo từng vùng để biết data ở đâu mà tìm kiếm => Tăng tốc truy vấn. Google thêm

13/ Có khoảng 7 tỉ data cần lưu. Tuy vậy chỉ có khoảng 1 tỉ data cần đẩy lên online và các data còn lại thì chỉ ở dạng lưu trữ để tham chiếu khi cần thiết.
 Nên tổ chức lưu trữ data thế nào sao cho thuận tiện, đảm bảo cả về performance và tính tiện lợi
Có thể trả lời là lưu 2 schema. 1 schema lưu online, 1 schema lưu tất tần tật chỗ còn lại và đánh partition, index cho phù hợp (https://comdy.vn/sql-server/schema-trong-sql-server/).

14/ Có cách nào để kiểm tra index đã được thiết định đúng chưa không
Dùng Explain SQL. Chú ý với DB là Oracle thiết định index chưa chắc đã chạy theo index. Tìm hiểu keyword Oracle Hint.
15/ StringPool trong Java
Đọc về phần này. Chú ý cơ chế Garbage Collection của Java 7 và Java 8 với String là khác nhau

+ Kiến trúc microservice (cách triển khai, bao gồm những thành phần nào, xử lý như nào khii 1 trong các service lỗi) 
+ Service discovery có tác dụng như thế nào?
+ API Gateway
+ Đã bao giờ dựng môi trường cho product?
+ Đã bao giờ deploy hệ thông trên cloud
+ AWS làm các dịch vụ nào?
+ Làm sao tối ưu hóa 1 câu try vấn SQL (Tự participate 1 bảng nào chưa? Đánh index? Khi nào tối ưu hóa? 
+ Multi data service? Log hệ thống ra file hay ELK Stack? Dùng gì để log ra file? Định dạng như thế nào? Có cách nào quản lý các log file?
+ Định nghĩa SOLID? Có mấy cách inject? 
+ Đã bao giờ sử dụng sping AOP
+ Trạng thái của Object trong Hibernate
+ Đã làm việc với batch? Cách insert batch? Update batch?
+ Định nghĩa hộp trăng/ hộp đen
+ Đã có kinh nghiệm viết unit test? Mức độ test?
+ Có mấy cách khởi tạo thread và hiểu về thread safe như thế nào. 
+ Hiểu biết thế nào về spring boot. 
+ So sánh String builder và String buffer 
+ Giao tiếp giữa các service trong mô hình microservice (sử dụng rabbitmq )
----------------------------
- Spring Hibernate:
+ Mô hình MVC
+ Controller trong Spring dùng để làm gì
+ IoC thể hiện như nào trong Spring
+ Các loại HTTP Status
+ POST và PUT khác nhau như nào ? Có thể dùng PUT để tạo resource mới hay ko ?
+ Các phương thức HTTP trong SpringMVC với SpringBoot có khác gì nhau ?
+ SpringBoot có tuân theo mô hình MVC ko ?
+ So sánh controller trong SpringMVC với controller trong SpringBoot
+ Khi gửi 1 request Post thì lúc xử lý ở server xong, giá trị trả về cho View gồm những gì ?
+ Session và Cookies
+ Authentication với Authorization là gì
+ @Component, @Controller, @Service, @Repository, nói chung là Bean trong Spring là gì ?
+ File Repository trong Spring dùng để làm gì ? JPA các thứ
+ Khi tạo Entity trong JPA thì có những annotation quan trọng nào ?
+ Quan hệ 1 - nhiều, nhiều - nhiều,... thể hiện như nào trong Hibernate ?
+ Hỏi về thiết kế DB: có 1 bảng Author (tác giả) và 1 bảng Post (bài báo), thì thiết kế ER như nào ?
+ Khi xóa 1 data Author thì cũng cần xóa các Post có liên quan tới Author đó đi, xử lý điều này như nào ?
+ Nếu muốn quản lý data Author theo trường email thì cần làm gì với trường này ?
+ Index trong DB dùng để làm gì ?

- Java Core:
+ So sánh Array với ArrayList với LinkedList về cấu trúc dữ liệu, cách tổ chức data, hiệu năng các thứ
+ So sánh interface với abstract class. Tại sao ko sử dụng abstract class chứa toàn abstract function thay cho interface ?
+ Overriding với Overloading là gì ?

- OOP:
+ Phân biệt Kế thừa và Đa hình
+ Tính đóng gói là gì và thể hiện như nào trong code
----------------------------
java core
1. So sánh sự khác biệt interface và abstract
Tại sao phải sinh ra interface mà không dùng luôn abstract
2. Các loại access modified trong java, phạm vị sử dụng của chúng
3. Boxing và Unboxing là gì
4. So sánh Array và ArrayList
5. ArrayList có lưu được primitive không
6. Cơ chế cấp phát bộ nhớ động của ArrayList như nào
6. So sánh ArrayList và LinkedList
7. Nêu cấu tạo của HashMap
8. So sánh HashSet và HashMap? Tại sao HashSet lại không cho phép lưu các đối tượng trùng nhau
9. String pool trong java là gì
10. So sánh Error và Exception. Lấy ví dụ về Error
11. Có những loại Exception nào trong java
12. Nêu khái niệm SOLID
13. Các pattern nào hay sử dụng. Mô tả cách triển khai nó(optional)
14 Có biết Singleton không. Nó để làm gì
15. Bonus: có biết cách nào để hủy singleton không
Database
1. Có các chuẩn nào trong DB mô tả
2. Store procedure là gì, so sánh với function
3. Làm thế nào để tăng performance khi truy vấn
4. Index trong DB là gì. Đánh nó như nào cho phù hợp
Spring
1. So sánh springMvc và Springboot
2. So sánh IOC và DI
3. So sánh Hibernate và JPA
4. Các annotation component, service, controller đổi vị trí cho nhau được không
Nếu được thì tại sao lại phải tách ra như vậy
5. So sánh RestController và Controller
6. Các trạng thái của entity
7. Các scope bean trong spring
8. Có các cách inject bean nào
9. 2 bean có cùng context thì làm cách nào để phân biệt và sử dụng chúng -> dùng primary hoặc qualified
Nâng cao
1. So sánh session và JWT
2. Có biết micro service không. Có các cách giao tiếp nào giữa các.service
3. Kafka là gì, docker là gì có biết ko

Bài toán
1. Có 1 dãy số tự nhiên 1 đến N có 1 số bất kỳ khác dãy N. Làm thế nào tìm ra số kia
2. Có 8 viên bi trong đó có 1 viên bi nặng hơn cần ít nhất mấy lần cân để tìm ra viên bi đó
3. Có 1 chuỗi gồm 2 ký tự. Làm sao biết chuỗi đó có cân bằng không
---------------------------------
- Exception trong java có mấy loại ?
- Phân biệt interface và abstract class
- Có những cách nào để tạo Thread
- RESTful API là gì ?
- String pool là gì ?
- Phân biệt ArrayList và LinkedList
- Hiểu biết gì về OAuth2
- So sánh MyBatis với Hibernate
- Nguyên tắc SOLID
- Đánh index trong DB như nào ?
---------------------------------
- Set với List khác nhau như nào ?
- Phân biệt interface và abstract
- Giải thích tại sao String là immutable ???
- Dùng BufferReader và BufferWriter thì khác gì so với việc dùng Reader và Writter ?
- Có 1 list số nguyên, hãy viết thuật toán tìm ra phần tử lớn thứ 2 trong list đó
- Làm thế nào để select ra những bản ghi không bị trùng lặp ? Làm thế nào để select ra những bản ghi bị lặp nhiều hơn 1 lần ?
- Stack với Queue là gì ?
---------------------------------
- Phân biệt interface và abstract
- Đa hình trong OOP là gì
- Khóa chính, khóa ngoại là gì ? 1 bảng ko tạo khóa chính thì có vấn đề gì không ?
- Có bàng A và bảng B quan hệ với nhau là 1-n, khi xóa data trong bảng A thì cần xóa các data tương ứng trong bảng B. Xử lý việc này như nào ?
- float và double khác nhau như nào ?
- ArrayList và LinkedList khác nhau như nào ?
- Trong table A có trường Ngày đăng ký, khi đăng ký data vào bảng này thì tự động lấy ngày giờ hệ thống để đăng ký vào trường này. Việc này xử lý như nào trong MySQL ? Oracle ?
- Trình bày mô hình SpringMVC.
