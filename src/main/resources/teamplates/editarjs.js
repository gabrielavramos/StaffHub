const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');

const form = document.getElementById('editarForm');

async function carregarFuncionario() {
    try {
        const response = await fetch(`http://localhost:8080/api/funcionarios/${id}`);
        if (!response.ok) throw new Error('Erro ao buscar funcionário.');

        const funcionario = await response.json();

        document.getElementById('nome').value = funcionario.nome || '';
        document.getElementById('email').value = funcionario.email || '';
        document.getElementById('cargo').value = funcionario.cargo || '';
        document.getElementById('salario').value = funcionario.salario || '';
        document.getElementById('telefone').value = funcionario.telefone || '';

        if (funcionario.dataNascimento) {
            document.getElementById('dataNascimento').value =
                funcionario.dataNascimento.split('T')[0];
        }
    } catch (error) {
        console.error(error);
        alert('Erro ao carregar funcionário.');
    }
}

form.addEventListener('submit', async (e) => {
    e.preventDefault();

    const funcionario = {
        nome: document.getElementById('nome').value,
        email: document.getElementById('email').value,
        cargo: document.getElementById('cargo').value,
        salario: parseFloat(document.getElementById('salario').value),
        dataNascimento: document.getElementById('dataNascimento').value,
        telefone: document.getElementById('telefone').value
    };

    try {
        const response = await fetch(`http://localhost:8080/api/funcionarios/${id}`, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(funcionario)
        });

        if (response.ok) {
            alert('Funcionário atualizado com sucesso!');
            window.location.href = 'visualizar.html';
        } else {
            alert('Erro ao atualizar funcionário.');
        }
    } catch (error) {
        console.error(error);
        alert('Erro na conexão com a API.');
    }
});

carregarFuncionario();
