use std::io::{self, Read};
use std::fmt::Write;

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let word = buffer.trim();

    let mut out = String::new();
    for i in 0..word.len() {
        writeln!(out, "{}", i).unwrap();
    }
    print!("{out}");
}