// Script básico para eventos en la página
document.addEventListener("DOMContentLoaded", function () {
    console.log("Página cargada correctamente.");

    let buttons = document.querySelectorAll("button");
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            alert("¡Botón clickeado!");
        });
    });
});
