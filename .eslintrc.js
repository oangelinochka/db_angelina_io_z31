module.exports = {
  parser: '@typescript-eslint/parser',
  extends: [
    'eslint:recommended',
    'plugin:@typescript-eslint/recommended'
  ],
  plugins: ['@typescript-eslint'],
  env: {
    node: true,
    es6: true
  },
  rules: {
    semi: ['error', 'always'],
    quotes: ['error', 'single']
  }
};