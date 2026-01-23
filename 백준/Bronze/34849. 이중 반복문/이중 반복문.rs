use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    
    let n: i32 = buffer.trim().parse().unwrap();
    println!("{}", if n > 10000 { "Time limit exceeded" } else { "Accepted" });
}