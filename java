1. Stateless vaf statefull: 
a. Stateless: là trạng thái không lưu toàn bộ thông tin về Client trong Server.
Tưc là tình trạng không có trạng thái. Thiết kế không có vai trò lưu trữ thông tin trên server của client.
Khi server nhận được dữ liệu từ client và nó sẽ thực thi ngay sau đó để trả về kết quả. Sau quá trình này mqh giữ client và server sẽ hoàn toàn cắt đứt.
Vì vậy mỗi giao dịch đều được xem la lần đầu tien thực hiện. Các giao thức thuộc stateless như: Http, UDP, DNS
a1.: http: giao thức truyền tải siêu văn bản, nó dựa trên TCP/IP cho phep lấy cá tài nguyên vd như HTML, text, video, ảnh.... các yêu cầu request thươngt đc tạo bởi
client.
2. Stateful là trạng thái có lưu trữ thông tin của Client trong Server. Mối liên kết giữa máy chủ và máy khách bị rằng buộc ( không thể hoạt động độc lập ). 
Dữ liệu được lưu trữ sau mỗi lần request của client.
ứng dụng của stateful thường là các service dạng databse, điển hình là mySql, mariadb.FTp ( file tranfer portal). telnet.( giao thức mạng)


