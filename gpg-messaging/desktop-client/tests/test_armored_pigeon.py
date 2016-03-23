#!/usr/bin/python3
# test_armored_pigeon.py by Mike Deiters and Eric Kim
# This will test all of our functions

from armored_pigeon.message import Message
import pytest

# def test_encrypt(self):
#     self.test_user = User(first_name='Jim', last_name='Bob', email='jim.bob@example.com')
#     self.test_user.public_key("""
#             mQENBFbu/SIBCADZqp062Ky3evGJjzormGDFhk5RSnce/r0dOmyrX+fi6v0iLKJf
#             9pbEaRViUQmm4J0qbsbX7YyYmOieqmo+iorMXdpImgcdEi3T/Q/jcZstbWJ2wnO1
#             lUy7GDCHNYvswf3BlGgBPAA4yJxVK+vbACq61Ky080YDKxbkfO2PbdhIvnkyoMme
#             ohDEk6YXiX7p35KXCA6qBMGIoFV0Im7m/MKqCOAtvcQAbSxjIIVomkR63G0cTePf
#             QtewxclZJfUn1Tpiy/E4LWGyjdSSeqqUcvSRJ8JhXFK50obRj37dVziNM9Br+3wl
#             k0TGb1BKKhRcHz5p6AC9A+xUsmL/ViOJD/N9ABEBAAG0LUppbSBCb2IgKFVuaXRU
#             ZXN0IFVzZXIpIDxqaW0uYm9iQGV4YW1wbGUuY29tPokBPgQTAQIAKAUCVu79IgIb
#             AwUJABJ1AAYLCQgHAwIGFQgCCQoLBBYCAwECHgECF4AACgkQ9cocpgXdp+a13gf+
#             NbJYV+XHlH/QDI+XL1mApKTyICSCXCkx+mBA+MFAzDlfdS9UoO3ogkAQUBO8frs5
#             6bhuvwjybj7JxH5Yoxe46rGIbKEEdAh22B5wUGli9YGt7fbZQTjDNVIU/ansAkl5
#             ss3xsjkzdDDOHSMVyp/DdC1yMc6hesslCaq6wV6AYeiI3DcWzBaSBLNlCH+HcQlE
#             j3yeEWE+Y8MP8Df+IoHGwcywM26SNqz4e6n9m0QD1wpT4wIfHy/6GEBYlksejjJk
#             H3KCBBsA45fkbIOn1CPxBkNHQPf02wgYfHONtLH6Wh9GnATpFIC8/FFDuzY6W3CO
#             hR1JlEQvyzsq5QJn9xU0OrkBDQRW7v0iAQgA4pyF7gMKOtWdXwca/2ZAhjiYpl50
#             jhlYd/GdGzAwVTLvfe84+pN+2WlAm992LCL/Tjtz51FdU9H7cyE+amdJmBOMUcJr
#             wPT1UR4cCKFaxbChOoDUONSuKc2m3S/tKPMPb2PREMhDvWiMoxCA3vGAIYXejePm
#             6+w3Auy/mhdKrmYGqGEvApqXlJuBjPD+cma//eIhLCYDlq0N4MX0/7VbaN1lqBvc
#             tTFqeyKsHCPsu23nwjjckbpasYdtYc4+0znB153p46C+RDRaJJC3k36B+1HsYEdn
#             LiozHtJ1mTfb8p0FPz4EWW2IUN9F8t6ERkRgBYk9fiArMW/TiNc6f/I3+wARAQAB
#             iQElBBgBAgAPBQJW7v0iAhsMBQkAEnUAAAoJEPXKHKYF3afmDAYIAJVVRG2uHFGH
#             orOZPHEZaOQwVYLTq8jK4UN6laZLRRU1AhhRhdG8TwU+Qk5oGvBFxfbDsiqxjDwT
#             OTgSUPx3LmwWLUp2OxbAkf4enxgNiqdqLojy8+4lwDN3jN7/AHMbEZl1DW+qs9av
#             7uj70ssRlFG4fC147RZrRPe18V/hu+K4xb7PbrdIRO6vxBnqyzxrlT58FNn+hEtJ
#             oVL3lYcCC8/CJnWNQJJwk+vBL0+a1+wpQfUWXJHpcorPCMKkpfUn8SloRsgJe4DE
#             +seLERk6vMaEFtCUjNLYHkT028HtWflC1/NIDi3C+31wQRKtcaCmswgQLkLCcny5
#             vSSIksV7rfU=
#             =100w
#         """)

def test_decrypt():
    test_decrypted_message = 'hello world'
    test_encrypted_message = """
        -----BEGIN PGP MESSAGE-----
        Version: GnuPG v1

        hQEMA90fTTsqE9cVAQf/bqP/ConjZ7ZpjVK5zl0hXXC2OK4vW6N5BJmZceL5srLM
        t5oDpNseSsz9a2RCabfINbLRLNMysy7I7BMQYThLjmKsI1D5WS8hL8hg2edj7qpR
        UxC2YczZK/ovGV5fxGvFyyhGphf1cNd9iw3A+2+N+AkTKH7WIqBI30NAgjVty45M
        Z2KMfDf+xwl69CyKX3i3FEA+bG31F3bI8GM1u4g3uq1Jr4MHE6ohEdLV9VjcTAs9
        kj4A4EwBdBebhT5x+l8t/KcSlbBCMOhDkDk6aFd4Tf30lMtxxeO2Lpz32VenxSPB
        XJzFDozeG1bVF/fZZ6Jvxx//HSsnQrW1DwMUtb2RNNJHAXYYfIaKZKW70G6JT5/3
        Tvm1Tn2+d+3PVfFU341h28GuDJuJElFx/4vQjP4edijqRb0J+3CWYnW9HJY4CGQy
        hWye+d/QAU0=
        =hq9P
        -----END PGP MESSAGE-----
    """
    test_message = Message()
    assert test_message.decrypt(test_encrypted_message) == test_decrypted_message