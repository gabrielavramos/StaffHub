document.getElementById('cadastroForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    const url = "http://localhost:8080/api/beneficios"; // endpoint da API de benefícios

    try {
        // Coleta os dados do formulário
        const fornecedor = document.getElementById("fornecedor").value;
        const nome = document.getElementById("nome").value;
        const valor = parseFloat(document.getElementById("valor").value);
        const categoria = document.getElementById("categoria").value;


        const response = await fetch(url, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "fornecedor": fornecedor,
                "nome": nome,
                "valor": valor,
                "categoria": categoria,

            })
        });

        if (!response.ok) {
            throw new Error(`Erro na requisição: ${response.status} - ${response.statusText}`);
        }

        alert("Benefício cadastrado com sucesso!");
        window.location.href = "visualizar_beneficio.html";

    } catch (error) {
        console.error("Erro ao cadastrar benefício:", error);
        alert("Ocorreu um erro ao cadastrar o benefício. Verifique o console para mais detalhes.");
    }
});
