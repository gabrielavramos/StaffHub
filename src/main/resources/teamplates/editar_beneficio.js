const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');

const form = document.getElementById('editarBeneficioForm');

async function carregarBeneficio() {
    try {
        const response = await fetch(`http://localhost:8080/api/beneficios/${id}`);
        const beneficio = await response.json();

        document.getElementById('nome').value = beneficio.nome;
        document.getElementById('valor').value = beneficio.valor;
        document.getElementById('fornecedor').value = beneficio.fornecedor;
        document.getElementById('categoria').value = beneficio.categoria;
    } catch (error) {
        alert('Erro ao carregar benefício.');
    }
}

form.addEventListener('submit', async (e) => {
    e.preventDefault();

    const beneficio = {
        nome: document.getElementById('nome').value,
        valor: parseFloat(document.getElementById('valor').value),
        fornecedor: document.getElementById('fornecedor').value,
        categoria: document.getElementById('categoria').value
    };

    try {
        const response = await fetch(`http://localhost:8080/api/beneficios/${id}`, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(beneficio)
        });

        if (response.ok) {
            alert('Benefício atualizado com sucesso!');
            window.location.href = 'visualizar_beneficio.html';
        } else {
            alert('Erro ao atualizar benefício.');
        }
    } catch (error) {
        console.error(error);
        alert('Erro na conexão com a API.');
    }
});

carregarBeneficio();
