use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();

    let mut n = it.next().unwrap().parse().unwrap();
    n = n * n;

    let mut sum: i64 = 0;
    for _ in 0..n {
        sum = sum + it.next().unwrap().parse::<i64>().unwrap();
    }
    print!("{}", sum);
}