async function carregarBeneficios() {
    const tabela = document.getElementById('beneficios').getElementsByTagName('tbody')[0];
    tabela.innerHTML = '';

    try {
        const response = await fetch('http://localhost:8080/api/beneficios');
        const beneficios = await response.json();

        beneficios.forEach(b => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${b.nome}</td>
                <td>${b.valor}</td>
                <td>${b.fornecedor}</td>
                <td>${b.categoria}</td>
                <td>
                    <button onclick="editarBeneficio(${b.id})">Editar</button>
                    <button onclick="confirmarExclusao(${b.id})">Excluir</button>
                </td>
            `;
            tabela.appendChild(row);
        });
    } catch (error) {
        console.error(error);
        alert('Erro ao carregar benefícios.');
    }
}

// Redireciona para a página de confirmação de exclusão
function confirmarExclusao(id) {
    window.location.href = `excluir_beneficio.html?id=${id}`;
}

function editarBeneficio(id) {
    window.location.href = `editar_beneficio.html?id=${id}`;
}

carregarBeneficios();
