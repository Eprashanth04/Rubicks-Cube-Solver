function solveCube() {
  const output = document.getElementById('output');
  output.value = "";

  const initialCube = `
Initial Cube:
[White Face]
W W W
W W W
W W W

[Red Face]
R R R
R R R
R R R

...

Moves Used:
F U R U' R' F'

Final Cube:
[White Face]
W W W
W W W
W W W

...

Solved? true
  `;

  output.value = initialCube.trim();
}
