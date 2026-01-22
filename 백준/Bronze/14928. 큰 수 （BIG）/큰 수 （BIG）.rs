use std::io::{self, Read};

const MOD: i32 = 2000_0303;

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let numbers = buffer.as_str().trim();
    
    let mut output: i32 = 0;
    for character in numbers.chars() {
        let c = character.to_digit(10).unwrap() as i32;
        output = ((output * 10) + c) % MOD;
    }
    println!("{}", output);
}