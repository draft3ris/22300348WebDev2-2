<h1>웹 서비스 개발 Project 2-2: JSP CRUD w/ DB</h1>
<h2>By 배현재 22300348</h2>
<h2>배포된 사이트 URL</h2>
<a href="http://walab.handong.edu:8080/OSS24_22300348_1/">여기로!</a>
<br>
<h2>데이터베이스 - 간단한 포럼</h2>

<h3>Field 1: ID</h3>
<p>INT PK + NN + AI 필드. 포스트의 순번을 표시한다</p>
<h3>Field 2: Name</h3>
<p>VARCHAR NN 필드. 글쓴이의 이름이다.</p>
<h3>Field 3: Title</h3>
<p>VARCHAR NN 필드. 글 제목이다.</p>
<h3>Field 4: Phone no.</h3>
<p>CHAR NN 필드. 글쓴이의 전화번호이고, 기입할때는 무조건 XXX-XXXX-XXXX 포맷을 따라야한다.</p>
<h3>Field 5: Post Type</h3>
<p>VARCHAR NN 필드. 글의 타입 (announcement, discussion, poll) 이다.</p>
<h3>Field 6: User Type</h3>
<p>VARCHAR NN 필드. 유저의 계급을 나타낸다.</p>
<h3>(Hidden) Field 7: Added date</h3>
<p>TIMESTAMP 필드로, 자동으로 글쓴 시간이 들어간다. 따로 웹페이지 에서는 보이지 않으며, 혹시나 나중에 쓸것 같아서 추가했다.</p>