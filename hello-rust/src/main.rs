use rand::Rng;
use std::io;
fn main() {
    let secret_number = rand::thread_rng().gen_range(1, 10);
    println!("Welcome to the guessing game!");
    println!("Enter your guess: ");
    let mut guess = String::new();
    io::stdin()
        .read_line(&mut guess)
        .expect("Failed to readline");
    let guess: u32 = guess.trim().parse().expect("Please type a number!");
    if secret_number == guess {
        println!("You are correct");
    } else {
        println!("You are incorrect");
        println!("The correct awnser was {}", secret_number)
    }
}
