use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();
    
    let t: usize = it.next().unwrap().parse().unwrap();
    let mut out = String::new();
    
    for _ in 0..t {
        let a: i32 = it.next().unwrap().parse().unwrap();
        let b: i32 = it.next().unwrap().parse().unwrap();
        let word: &str = it.next().unwrap();
        
        for &c in word.as_bytes() {
            out.push((((a * (c - b'A') as i32 + b) % 26) as u8 + b'A') as char);
        }
        out.push('\n');
    }
    print!("{out}");
}