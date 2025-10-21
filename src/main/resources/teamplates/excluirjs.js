// Pega o ID do funcionário da query string
const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get("id");

const mensagemEl = document.getElementById("mensagem");
const statusEl = document.getElementById("status");
const botoesEl = document.getElementById("botoes");
const confirmarBtn = document.getElementById("confirmar");
const cancelarBtn = document.getElementById("cancelar");

// Carrega os dados do funcionário via API
async function carregarFuncionario() {
    try {
        const response = await fetch(`http://localhost:8080/api/funcionarios/${id}`);
        if (!response.ok) throw new Error("Funcionário não encontrado");

        const funcionario = await response.json();
        // Ajuste para o campo correto
        mensagemEl.innerText = `Tem certeza que deseja excluir ${funcionario.nome}?`;
    } catch (error) {
        mensagemEl.innerText = "Erro ao carregar funcionário.";
        console.error(error);
        botoesEl.style.display = "none";
    }
}

// Confirma exclusão
confirmarBtn.addEventListener("click", async () => {
    try {
        const response = await fetch(`http://localhost:8080/api/funcionarios/${id}`, {
            method: 'DELETE'
        });

        if (response.ok) {
            statusEl.style.color = 'green';
            statusEl.innerText = "Funcionário excluído com sucesso!";
            setTimeout(() => window.location.href = "visualizar.html", 1500);
        } else {
            throw new Error("Erro ao excluir funcionário.");
        }
    } catch (error) {
        statusEl.style.color = 'red';
        statusEl.innerText = error.message;
        console.error(error);
    }
});

// Cancela exclusão
cancelarBtn.addEventListener("click", () => {
    window.location.href = "visualizar.html";
});

// Inicializa
carregarFuncionario();
