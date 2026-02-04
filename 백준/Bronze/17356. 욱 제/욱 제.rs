use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();

    let a: f64 = it.next().unwrap().parse().unwrap();
    let b: f64 = it.next().unwrap().parse().unwrap();

    let x: f64 = 10.0;
    let m = (b - a) / 400.0;
    let win_rate = 1.0 / (1.0 + x.powf(m));
    print!("{win_rate}");
}