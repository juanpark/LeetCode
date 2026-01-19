use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut iter = input.split_whitespace();

    let rounds: usize = iter.next().unwrap().parse().unwrap();
    let a = iter.next().unwrap().as_bytes();
    let n: usize = iter.next().unwrap().parse().unwrap();

    let mut arr_b = vec![vec![0u8; rounds]; n];

    for i in 0..n {
        let row = iter.next().unwrap().as_bytes();
        for j in 0..rounds {
            arr_b[i][j] = row[j];
        }
    }

    let mut score = 0;
    let mut max = 0;

    for i in 0..rounds {
        let mut s = 0;
        let mut r = 0;
        let mut p = 0;

        for j in 0..n {
            score += turn(a[i], arr_b[j][i]);
            s += turn(b'S', arr_b[j][i]);
            r += turn(b'R', arr_b[j][i]);
            p += turn(b'P', arr_b[j][i]);
        }
        max += s.max(r).max(p);
    }
    println!("{}", score);
    println!("{}", max);
}

fn turn(a: u8, b: u8) -> i32 {
    if a == b { 1 }
    else if a == b'S' && b == b'P' { 2 }
    else if a == b'R' && b == b'S' { 2 }
    else if a == b'P' && b == b'R' { 2 }
    else { 0 }
}