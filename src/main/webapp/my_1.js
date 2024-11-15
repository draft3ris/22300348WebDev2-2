function confirmDelete(id){
    if (confirm("정말로 삭제 하겠습니까?")) {
        window.location.href = "delete_ok.jsp?id=" + id;
    }
}