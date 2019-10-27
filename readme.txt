1) чтобы скачать проект в терминале вводим:
git clone https://github.com/KairatO/project.git
2) далее в терминале переходим в директорию проекта и вводим:
mvn clean install -DskipTests
3) для запуска сервера вводим:
mvn jetty:run
4) ждем когда запуститься сервер и потом переходим по адресу http://localhost:8080
5) нажимаем кнопку press here и видим результат Hello world !!!
6) останавливаем сервер: ctrl+c
7) в файле myProject/src/main/java/kz/project/web/db/Db.java на 44 строке меняем "id = 1" на "id = 2"
8) запускаем заново сервер
9) ждем когда запуститься сервер и потом переходим по адресу http://localhost:8080
10) нажимаем кнопку press here и видим результат Greet Go
