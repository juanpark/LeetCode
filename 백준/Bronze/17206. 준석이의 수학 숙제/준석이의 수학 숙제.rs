use std::io::{self, Read};

fn main() {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    let mut it = buffer.split_whitespace();

    let mut out = String::new();
    let t: usize = it.next().unwrap().parse().unwrap();
    for _ in 0..t {
        let n: i32 = it.next().unwrap().parse().unwrap();
        let k3: i32 = n / 3;
        let k7: i32 = n / 7;
        let k21: i32 = n / 21;
        let mut sum: i64 = 0;
        sum = sum + (arith_series(k3) * 3) as i64;
        sum = sum + (arith_series(k7) * 7) as i64;
        sum = sum - (arith_series(k21) * 21) as i64;
        out.push_str(&sum.to_string());
        out.push('\n');
    }
    print!("{out}");
}

fn arith_series(k: i32) -> i32 {
    return k * (k + 1) / 2
}