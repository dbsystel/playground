#[cfg(test)]
mod tests; // INCLUDE TEST FILE

fn main() {
    let args: Vec<String> = std::env::args().skip(1).collect();
    let language = match args.get(0) {
        Some(s) => s,
        None => "en" // DEFAULT TO ENGLISH
    };

    println!("{}", hi(&language));
}

fn hi(lang: &str) -> String {
    match lang {
        "en" => "Hello World!".to_owned(),
        "de" => "Hallo Welt!".to_owned(),
        "dk" => "Hey Verden!".to_owned(),
        _ => panic!("language not supported")
    }
}