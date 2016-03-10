try:
    from setuptools import setup
except ImportError:
    from distutils.core import setup

config = {
    'description' : 'Armored Pigeon',
    'author' : 'Mike Deiters, Eric Kim',
    'url' : 'https://github.com/soft-eng-practicum/gpg-messaging.git',
    'author_email' : 'contact@armoredpigeon.io',
    'version' : '0.1',
    'install_requires' : [
        'python-gnupg',
        'PyMySQL'
    ],
    'packages' : ['armored_pigeon'],
    'scripts' : [],
    'name' : 'armored_pigeon'
}

setup(**config)