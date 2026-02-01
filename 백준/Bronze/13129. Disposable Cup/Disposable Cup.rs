use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();

    let a: i32 = it.next().unwrap().parse().unwrap();
    let b: i32 = it.next().unwrap().parse().unwrap();
    let n: i32 = it.next().unwrap().parse().unwrap();

    let mut min = a * n + b;
    let mut out = String::new();
    out.push_str(&min.to_string());
    out.push(' ');

    for _ in 1..n {
        min = min + b;
        out.push_str(&min.to_string());
        out.push(' ');
    }
    print!("{out}");
}