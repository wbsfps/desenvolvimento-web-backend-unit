let h1 = document.querySelector('h1');
let button = document.querySelector('button');
let form = document.querySelector('form');
let msgConfirmandoForm = document.querySelector('.result');
let msg = document.querySelector(".mensagem")

form.addEventListener('submit', (event) => {
    event.preventDefault();
    console.log(msg.value);
    msgConfirmandoForm.textContent = `Formulário enviado com sucesso`;
});
