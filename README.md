# 👩‍💻웹 개발 입문과 데이터베이스 

## 01. REST API-GET-01
- Spring Boot를 통해서 HTTP 메소드(get) 작성
- http://localhost:8080/api/hello

## 02. REST API-GET-02
- 주소 내에 정보를 전달하는 방법(Path Variable)
- http://localhost:8080/api/echo/hello
- 한글이 깨지는 이유(UTF-8)
- 8080 포트를 이미 사용 중인 문제

## 03. REST API-GET-03
- http://localhost:8080/api/echo/steve/age/20/is-man/true
- query 파라미터로 데이터를 받는 방법 2가지(편의사항에 따라 파싱)
  1. [객체로 받는 방법](http://localhost:8080/api/book?category=IT&issuedYeer=2023&issued-month=01&issued_day=31)
  2. [수동으로 받는 방법](http://localhost:8080/api/book2?category=IT&issuedYeer=2023&issuedMonth=01&issuedDay=31)
- Query Parameter: 특정 정보의 필터링
  - 주소 뒤에 ?로 시작, &로 묶음
 
## 04. REST API-POST-01
- HTTP Body에 데이터를 담는 방법(xml, text, **json**)
- [Talend API Tester - Free Edition](https://chrome.google.com/webstore/detail/talend-api-tester-free-ed/aejoelaoggembcahagimdiliamlcdmfm?hl=ko) 사용
```
{
  "name" : "Spring Boot",
  "number" : "100",
  "category" : "JAVA"
}
```

## 05. REST API-POST-02
- RequestBody 사용
- JsonNaming으로 변수 매핑
```
{
  "user_name" : "홍길동",
  "user_age" : 10,
  "email" : "hong@gmail.com"
}
```
- 한글 깨지는 문제 해결(Help/Edit Custom VM Option)
```
-Dfile.encoding=UTF-8
-Dconsole.encoding=UTF-8
```
- JSON을 표현하는 방법 2가지
  1. **snake case**: 소문자, _로 구분
  2. carmel case: 소문자로 시작, 대문자로 구분

### [5 METHOD](https://velog.io/@xangj0ng/HTTP-5-METHODGET-POST-PUTPATCHDELETE)
||의미|CRUD|멱등성|안정성|Path Variable|Query Parameter|DataBody|
|---|---|---|---|---|---|---|---|
|GET|리소스 취득|R|O|O|O|O|X|
|POST|리소스 생성, 추가|C|X|X|O|△|O|
|PUT|리소스 갱신, 생성|C / U|O|X|O|△|O|
|DELETE|리소스 삭제|D|O|X|O|O|X|
