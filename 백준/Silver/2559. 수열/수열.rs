use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut it = input.split_whitespace();

    let n: usize = it.next().unwrap().parse().unwrap();
    let k: usize = it.next().unwrap().parse().unwrap();

    let mut arr = vec![0i32; n + 1];
    let mut max: i32 = i32::MIN;

    for i in 1..=n {
        let num: i32 = it.next().unwrap().parse().unwrap();
        arr[i] = arr[i - 1] + num;
        if i >= k {
            let tmp = arr[i] - arr[i - k];
            if tmp > max {
                max = tmp;
            }
        }
    }
    println!("{}", max);
}