use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();

    let n: usize = it.next().unwrap().parse().unwrap();

    let mut out = String::new();
    for _ in 0..n {
        let s: &str = it.next().unwrap();
        out.push_str(&s.to_lowercase());
        out.push('\n');
    }
    print!("{out}");
}