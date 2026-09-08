def test_exc_zero_negative():
    with pytest.raises(Exception):
        f.puissance(0, -1)

def test_zero_positive():
    assert f.puissance(0, 5) == 0
    assert f.puissance(0, 1) == 0
