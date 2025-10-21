// Pega o ID do benefício da query string
const urlParams = new URLSearchParams(window.location.search);
const idB = urlParams.get("id");

const mensagemEl = document.getElementById("mensagem");
const statusEl = document.getElementById("status");
const botoesEl = document.getElementById("botoes");
const confirmarBtn = document.getElementById("confirmar");
const cancelarBtn = document.getElementById("cancelar");

// Carrega os dados do benefício via API
async function carregarBeneficio() {
    try {
        const response = await fetch(`http://localhost:8080/api/beneficios/${idB}`);
        if (!response.ok) throw new Error("Benefício não encontrado");

        const beneficio = await response.json();
        mensagemEl.innerText = `Tem certeza que deseja excluir ${beneficio.nome}?`;
    } catch (error) {
        mensagemEl.innerText = "Erro ao carregar benefício.";
        console.error(error);
        botoesEl.style.display = "none";
    }
}

// Confirma exclusão
confirmarBtn.addEventListener("click", async () => {
    try {
        const response = await fetch(`http://localhost:8080/api/beneficios/${idB}`, {
            method: 'DELETE'
        });

        if (response.ok) {
            statusEl.style.color = 'green';
            statusEl.innerText = "Benefício excluído com sucesso!";
            setTimeout(() => window.location.href = "visualizar_beneficio.html", 1500);
        } else {
            throw new Error("Erro ao excluir benefício.");
        }
    } catch (error) {
        statusEl.style.color = 'red';
        statusEl.innerText = error.message;
        console.error(error);
    }
});

// Cancela exclusão
cancelarBtn.addEventListener("click", () => {
    window.location.href = "visualizar_beneficio.html";
});

// Inicializa
carregarBeneficio();
