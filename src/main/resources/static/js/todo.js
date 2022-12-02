function findAll() {
    fetch("/api/v1/todo", {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        },
    })
    .then(async function (response) {
        const data = await response.json();
        const tbody = document.getElementById("tbody");
        console.log(tbody);
        data.forEach(i => {
            const tr = document.createElement("tr");
            const title = document.createElement("td");
            const content = document.createElement("td");
            const writer = document.createElement("td");

            title.innerText = i.title;
            content.innerText = i.content;
            writer.innerText = i.writer;

            tr.appendChild(title);
            tr.appendChild(content);
            tr.appendChild(writer);
            tbody.appendChild(tr);
        })
    })
    .catch(function (error) {
        console.error(error);
    })
}

function insertTodo() {
    const title = document.getElementById("title").value;
    const content = document.getElementById("content").value;
    const writer = document.getElementById("writer").value;

    fetch("/api/v1/todo", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({
            title: title,
            content: content,
            writer: writer
        }),
    })
    .then(async function (response) {
        if (response.status === 200) {
            alert("등록 완료");
            location.reload();
        }
    })
    .catch(async function (error) {
        console.error(error);
    })
}

document.addEventListener( "DOMContentLoaded", function () {

    const insert = document.getElementById("insert");
    insert.addEventListener("click", insertTodo, false);
    findAll();

}, false);


