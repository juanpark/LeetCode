use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut it = input.split_whitespace();
    
    let mut sum: i32 = 0;
    for i in 0..5 {
        sum += it.next().unwrap().parse::<i32>().unwrap();
    }
    print!("{}", sum);
}