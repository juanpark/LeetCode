use std::io::{self, Read};
use std::fmt::Write;

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();

    let mut out = String::new();
    let t: usize = it.next().unwrap().parse().unwrap();
    for _ in 0..t {
        let n: i64 = it.next().unwrap().parse().unwrap();
        let k3 = n / 3;
        let k7 = n / 7;
        let k21 = n / 21;
        let mut sum: i64 = 0;
        sum = sum + (arith_series(k3) * 3);
        sum = sum + (arith_series(k7) * 7);
        sum = sum - (arith_series(k21) * 21);
        writeln!(out, "{}", sum).unwrap();
    }
    print!("{out}");
}

fn arith_series(k: i64) -> i64 {
    return k * (k + 1) / 2
}