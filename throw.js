function isPositive(a) {
  let y = 'YES';
  let ze = 'Zero Error';
  let ne = 'Negative Error';
  if (a > 0) {
    return y;
  } else if (a == 0) {
    return ze;
  } else if (a < 0) {
    return ne;
  }
}
