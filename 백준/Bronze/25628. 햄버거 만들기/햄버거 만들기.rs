use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();
    
    let A :u8 = it.next().unwrap().parse().unwrap();
    let B :u8 = it.next().unwrap().parse().unwrap();
    print!("{}", (A / 2).min(B));
}