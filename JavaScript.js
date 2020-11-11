var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseFloat(lines.shift());
var b = parseFloat(lines.shift()); 
var c = parseFloat(lines.shift()); 
var z;
    if(a < b + c && b < a + c && c < a + b)
    {
        console.log("Perimetro = " + (a + b + c).toFixed(1));
    }
    else
    {
        z = 0.5 * (a + b) * c;
        console.log("Area = " + z.toFixed(1));
    }
