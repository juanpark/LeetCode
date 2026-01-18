use std::io::{self, Read};

const RADIX: i32 = 9;

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut out = String::new();
    let mut t: i32 = input.trim().parse().unwrap();
    while t > 0 {
        let digit = (t % RADIX) as u8;
        out.push((digit + b'0') as char);
        t = t / RADIX;
    }
    let result: String = out.chars().rev().collect();
    print!("{}", result);
}