from distutils.core import setup
from distutils.extension import Extension
from Cython.Build import cythonize

ext_modules = [
    Extension(
        r'factorial',
        [r'factorial.pyx']
    ),
]

setup(
    name='factorial',
    ext_modules=cythonize(ext_modules),
)