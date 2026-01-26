use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let word = buffer.trim().as_bytes();
    
    let mut ban = [false; 26];
    for &c in b"CAMBRIDGE" {
        ban[(c - b'A') as usize] = true;
    }
    
    let mut out = String::new();
    for &c in word {
        if ban[(c - b'A') as usize] { continue; }
        out.push(c as char);
    }
    print!("{out}");
}