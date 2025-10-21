// Obtém o formulário pelo ID e adiciona um ouvinte de evento para 'submit'
document.getElementById('cadastroForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    const url = "http://localhost:8080/api/funcionarios";

    try {
        console.log("Enviando requisição POST para: ", url);

        // Coleta os dados do formulário
        const nomeCompleto = document.getElementById("nome").value;
        const email = document.getElementById("email").value;
        const cargo = document.getElementById("cargo").value;
        const dataNascimento = document.getElementById("dataNascimento").value;
        const salario = document.getElementById("salario").value;
        const telefone = document.getElementById("telefone").value;
         // alterado

        const response = await fetch(url, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "nome_completo": nomeCompleto,
                "senha": "password",
                "email": email,
                "cargo": cargo,
                "salario": salario,
                "data_nascimento": dataNascimento,
                "telefone" : telefone,
            })
        });

        if (!response.ok) {
            throw new Error(`Erro na requisição: ${response.status} - ${response.statusText}`);
        }

        alert("Funcionário cadastrado com sucesso!");

    } catch (error) {
        console.error("Erro ao cadastrar funcionário:", error);
        alert("Ocorreu um erro ao cadastrar o funcionário. Verifique o console para mais detalhes.");
    }
});
