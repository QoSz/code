from distutils.core import setup
from distutils.extension import Extension
from Cython.Build import cythonize

ext_modules = [
    Extension(
        r'add_',
        [r'add_.pyx']
    ),
]

setup(
    name='add_',
    ext_modules=cythonize(ext_modules),
)