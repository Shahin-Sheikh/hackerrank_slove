function factorial(n) {
  var fact = 1;

  for (var i = n; i > 0; i--) {
    fact *= i;
  }

  return fact;
}

function main() {
  const n = +readLine();

  console.log(factorial(n));
}
