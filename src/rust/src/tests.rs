use super::*;

#[test]
fn test_hi_en() {
    assert_eq!(&hi("en"), "Hello World!");
}

#[test]
fn test_hi_de() {
    assert_eq!(&hi("de"), "Hallo Welt!");
}

#[test]
fn test_hi_dk() {
    assert_eq!(&hi("dk"), "Hey Verden!");
}

#[test]
#[should_panic]
fn test_hi_unknown() {
    hi("0101");
}