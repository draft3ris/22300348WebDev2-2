import {handleSubmit_edit} from "./handleSubmit_edit.js";
import {handleSubmit_add} from "./handleSubmit_add";
(() => {
    'use strict'

    const forms = document.querySelectorAll('.needs-validation');

    Array.from(forms).forEach(form => {
        form.addEventListener('submit', event => {
            if (!form.checkValidity()) {
                event.preventDefault();
                event.stopPropagation();
            }
            else{
                const idField = form.querySelector('input[name="id"]');
                if (!idField || !idField.value) {
                    event.preventDefault(); // Block submission if the ID is missing
                    console.error('ID field is missing or empty');
                }
                //handleSubmit_edit();
            }
            form.classList.add('was-validated');
        }, false)
    })
})()