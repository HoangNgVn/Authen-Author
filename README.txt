# Authen-Author
-------- Database in Mysql --------------

-- users table --
id    password  username
1	123456	user
2	123456	admin

-- authorities table -- 
id       name  user_id
4	VIEW	1
5	VIEW	2
6	ADD	2


--------- Test on postman --------------
1. localhost:8080/hello: doesn't need authentication
2. localhost:8080/authen: need authentication
3. localhost:8080/getAll: user with authority VIEW or ADD can do
4. localhost:8080/addUser: user with authority ADD can do (only admin can, user can't)
