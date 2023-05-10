const input = document.getElementsByTagName('input');
for (let i = 0; i < input.length; i++) {
  input[i].addEventListener('mouseover', () => {
    input[i].style.color="red";
  });
}
for (let i = 0; i <input.length; i++) {
    input[i].addEventListener('mouseout', () => {
        input[i].style.color="black";
    });
  }