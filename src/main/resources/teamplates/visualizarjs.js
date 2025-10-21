async function carregarFuncionarios() {
    const tabela = document.getElementById('tabela-funcionarios');
    tabela.innerHTML = '';

    try {
        const response = await fetch('http://localhost:8080/api/funcionarios/view');
        if (!response.ok) throw new Error('Erro ao buscar funcionários');

        const funcionarios = await response.json();

        funcionarios.forEach(func => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${func.id}</td>
                <td>${func.nomeCompleto || func.nome}</td>
                <td>${func.email}</td>
                <td>${func.cargo}</td>
                <td>${func.salario}</td>
                <td>${func.dataNascimento}</td>
                <td>${func.telefone}</td>
                <td>
                    <button onclick="editarFuncionario(${func.id})">Editar</button>
                    <button onclick="excluirFuncionario(${func.id})">Excluir</button>
                </td>
            `;
            tabela.appendChild(row);
        });
    } catch (error) {
        console.error(error);
        alert('Erro ao carregar funcionários.');
    }
}

function editarFuncionario(id) {
    window.location.href = `editar.html?id=${id}`;
}

function excluirFuncionario(id) {
    // Redireciona para a página de exclusão com query string
    window.location.href = `excluir.html?id=${id}`;
}

// Inicializa
carregarFuncionarios();
