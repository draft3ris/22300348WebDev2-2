export function handleSubmit_edit(){
    const id = document.getElementById("validationCustom00").value;
    const name = document.getElementById("validationCustom01").value;
    const title = document.getElementById("validationCustom02").value;
    const phone = document.getElementById("validationCustom03").value;
    const post_type = document.getElementById("validationCustom04").value;
    const user_type = document.getElementById("validationCustom05").value;
    const params = new URLSearchParams({
        id: id,
        name: name,
        title: title,
        phone: phone,
        post_type: post_type,
        user_type: user_type
    });

    window.location.href = `edit_ok.jsp?${params.toString()}`;
}