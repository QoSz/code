from distutils.core import setup
from distutils.extension import Extension
from Cython.Build import cythonize

ext_modules = [
    Extension(
        r'num',
        [r'num.pyx']
    ),
]

setup(
    name='num',
    ext_modules=cythonize(ext_modules),
)