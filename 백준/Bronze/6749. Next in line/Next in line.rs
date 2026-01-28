use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();
    
    let y: u8 = it.next().unwrap().parse().unwrap();
    let m: u8 = it.next().unwrap().parse().unwrap();    
    print!("{}", m - y + m);
}