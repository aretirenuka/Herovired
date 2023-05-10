const api_url = "https://dummyjson.com/products";
//function declaration
async function get_api(url){
    const response=await fetch(url);//to fetch the data .it is inbuilt function
    var data=await response.json();
    console.log(data);
    show(data);
}

//function calling
get_api(api_url);

//other function declaration
function show(data){
    let tab = 
    `
    <tr>
    <th>Id</th>
    <th>Description</th>
    <th>Brand</th>
    <th>Price</th>
    </tr>
    `;
    for(let r of data.products){
        tab += `
        <tr>
        <td>${r.id}</td>
        <td><img src="${r.images}"></td>
        <td>${r.description}</td>
        <td>${r.brand}</td>
        <td>${r.price}</td>
        </tr>
        `;
    }
    document.getElementById("phone").innerHTML=tab;
}