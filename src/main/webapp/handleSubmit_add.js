export function handleSubmit_add(){
    const name = document.getElementById("validationCustom01").value;
    const title = document.getElementById("validationCustom02").value;
    const phone = document.getElementById("validationCustom03").value;
    const post_type = document.getElementById("validationCustom04").value;
    const user_type = document.getElementById("validationCustom05").value;
    console.log("name: " + name);
    console.log("title: " + title);
    console.log("phone: " + phone);
    console.log("post type: " + post_type);
    console.log("user type: " + user_type);
    window.location.href = "add_ok.jsp?name="+name
        +"&title="+title
        +"&phone="+phone
        +"&post_type="+post_type
        +"&user_type="+user_type;
    return false;
}