use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let n = buffer.trim().parse().unwrap();

    let mut out = String::new();
    let thick = "@@@@@".repeat(n);
    let thin = "@".repeat(n);

    for i in 0..5 {
        for _ in 0..n {
            if i == 0 || i == 2 {
                out.push_str(&thick);
            } else {
                out.push_str(&thin);
            }
            out.push('\n')
        }
    }
    print!("{out}");
}